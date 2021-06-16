package smrl.mr.owasp;

import java.util.List;
import smrl.mr.language.Action;
import smrl.mr.language.Operations;

import smrl.mr.language.MR;

@SuppressWarnings("all")
public class CWE_350 extends MR{
  public boolean mr() {
    List<Action> _actions = Operations.Input(1).actions();
    for (final Action action : _actions) {
      {
        int pos = action.getPosition();
        {
          ifThenBlock();
          if (((Operations.notAvailableWithoutLoggingIn(action) && 
            Operations.EQUAL(Operations.Input(2), Operations.Input(1))) && 
            Operations.Input(2).actions().get(pos).setHostName(Operations.validHostName()))) {
            ifThenBlock();
            boolean _AND = Operations.AND(
              Operations.different(Operations.Output(Operations.Input(2), pos), Operations.Output(Operations.Input(1), pos)), 
              Operations.isError(Operations.Output(Operations.Input(2), pos)));
            if (_AND) {
              expressionPass(); /* //PROPERTY HOLDS" */
            } else {
              return Boolean.valueOf(false);
            }
          } else {
            expressionPass(); /* //PROPERTY HOLDS" */
          }
        }
      }
    }
    return true;
  }
}
