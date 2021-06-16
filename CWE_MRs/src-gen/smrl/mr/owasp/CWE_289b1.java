package smrl.mr.owasp;

import java.util.List;
import smrl.mr.language.Action;
import smrl.mr.language.Operations;

import smrl.mr.language.MR;

@SuppressWarnings("all")
public class CWE_289b1 extends MR{
  public boolean mr() {
    String sep = "/";
    String hashed_sep = "%5C";
    for (int par = 0; (par < 3); par++) {
      {
        List<Action> _actions = Operations.Input(1).actions();
        for (final Action action : _actions) {
          {
            int pos = action.getPosition();
            String _urlPath = action.getUrlPath();
            String _plus = (_urlPath + sep);
            Object _RandomFilePath = Operations.RandomFilePath();
            String newUrl = (_plus + _RandomFilePath);
            String _urlPath_1 = action.getUrlPath();
            String _plus_1 = (_urlPath_1 + hashed_sep);
            Object _RandomFilePath_1 = Operations.RandomFilePath();
            String hashed_sep_newUrl = (_plus_1 + _RandomFilePath_1);
            {
              ifThenBlock();
              if (((((((((!Operations.isAdmin(action.getUser())) && 
                Operations.afterLogin(action)) && 
                Operations.EQUAL(Operations.Input(2), Operations.Input(1))) && 
                Operations.Input(2).actions().get(pos).setUrl(newUrl)) && 
                Operations.notTried(action.getUser(), newUrl)) && 
                Operations.EQUAL(Operations.Input(3), Operations.Input(1))) && 
                Operations.Input(3).actions().get(pos).setUrl(hashed_sep_newUrl)) && 
                Operations.notTried(action.getUser(), hashed_sep_newUrl))) {
                ifThenBlock();
                boolean _AND = Operations.AND(
                  Operations.AND(
                    Operations.different(Operations.Output(Operations.Input(2), pos), Operations.Output(Operations.Input(1), pos)), 
                    Operations.different(Operations.Output(Operations.Input(3), pos), Operations.Output(Operations.Input(1), pos))), 
                  Operations.AND(
                    Operations.isError(Operations.Output(Operations.Input(2), pos)), 
                    Operations.isError(Operations.Output(Operations.Input(3), pos))));
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
        sep = (sep + "../");
      }
    }
    return true;
  }
}
