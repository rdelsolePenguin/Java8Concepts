package animal.service;

import animal.domain.Bird;

@FunctionalInterface
public interface PrettyPrint<Bird> {
    String apply(Bird bird);
}
