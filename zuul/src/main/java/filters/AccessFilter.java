package filters;

import com.netflix.zuul.ZuulFilter;
import org.springframework.context.annotation.FilterType;

public class AccessFilter extends ZuulFilter{

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        return null;
    }
}
