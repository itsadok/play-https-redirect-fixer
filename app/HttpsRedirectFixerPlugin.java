import java.lang.reflect.Method;

import play.*;
import play.mvc.Http.*;
import play.mvc.*;

public class HttpsRedirectFixerPlugin extends PlayPlugin {
    @Override
    public void beforeActionInvocation(Method actionMethod) {
        Request request = Request.current();
        if(request.headers.get("x-forwarded-proto") != null &&
                "https".equals(request.headers.get("x-forwarded-proto").value())) {
            request.secure = true;
            request.port = 443;
        }
    }
}
