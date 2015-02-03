package com.ceilfors.javatogroovy.slurper

import groovy.json.JsonSlurper
import spock.lang.Specification
/**
 * @author ceilfors
 */
class SlurperSpec extends Specification {

    def "XML Slurper test"() {
        when:
        File pomFile = new File(this.class.getResource("/sample/pom.xml").toURI())
        def slurper = new XmlSlurper()
        def pom = slurper.parse(pomFile)

        then:
        pom.artifactId == "example"
        pom.dependencies.dependency.findAll { it.scope == "test" }.size() == 2
    }

    def "JSON slurper test"() {
        when:
        File responseFile = new File(this.class.getResource("/sample/response.json").toURI())
        def slurper = new JsonSlurper()
        def response = slurper.parse(responseFile)

        then:
        response.results.size() == 2
        response.results[0].name == "First"
        response.results[1].age == 20
    }
}
