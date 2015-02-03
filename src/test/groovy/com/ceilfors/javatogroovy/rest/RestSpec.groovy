package com.ceilfors.javatogroovy.rest

import groovyx.net.http.RESTClient
import spock.lang.Specification

/**
 * @author ceilfors
 */
class RestSpec extends Specification {

    def setup() {
        def restClient = new RESTClient("http://localhost:8080/")
        restClient.delete([:])
    }

    def "Test posting"() {
        when:
        def restClient = new RESTClient("http://localhost:8080/")
        restClient.post(body:
                [
                        name: "John",
                        age : 25
                ],
                requestContentType: 'application/json')
        def persons = restClient.get([:]).data

        then:
        persons.size() == 1
        persons[0].name == 'John'
        persons[0].age == 25

        when:
        restClient.post(body:
                [
                        name: "Jane",
                        age : 30
                ],
                requestContentType: 'application/json')
        persons = restClient.get([:]).data

        then:
        persons.size() == 2
        def jane = persons.find { it.name == 'Jane' }
        jane.name == 'Jane'
        jane.age == 30
    }
}
