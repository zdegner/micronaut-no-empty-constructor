package example;

import io.micronaut.context.annotation.Factory;
import io.micronaut.runtime.http.scope.RequestScope;

@Factory
public class IdentityFactory {
    @RequestScope
    public Identity identity() {
        return new Identity("John Smith");
    }
}
