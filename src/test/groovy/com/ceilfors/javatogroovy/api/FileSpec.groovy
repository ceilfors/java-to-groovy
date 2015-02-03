package com.ceilfors.javatogroovy.api

import spock.lang.Specification

/**
 * @author ceilfors
 */
class FileSpec extends Specification {

    def "Plain text"() {
        when:
        File file = new File(this.class.getResource("/sample/plain.txt").toURI())
        List<Integer> lines = []
        file.eachLine { lines << (it.toInteger()) }

        then:
        (0..2).each {
            assert lines[it] == it
        }
    }
}
