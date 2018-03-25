package pl.lunchbuddies.android

import spock.lang.Specification
import spock.lang.Unroll

class ExampleSpockUnitTest extends Specification {

    @Unroll
    def "addition is correct #a + #b = #result"() {
        when:
        def sum = a + b

        then:
        sum == result

        where:
        a | b | result
        0 | 0 | 0
        1 | 1 | 2
        1 | 2 | 3
        2 | 1 | 3
    }

}
