package de.mynethome.jwtDemo.api

import ratpack.groovy.handling.GroovyContext
import ratpack.groovy.handling.GroovyHandler

class ApiHandler extends GroovyHandler{
    @Override
    protected void handle(GroovyContext context) {
        context.render("Freundlich gesicherte Grüße " +
                       " an die BaselOne 2018 :-)")
    }
}
