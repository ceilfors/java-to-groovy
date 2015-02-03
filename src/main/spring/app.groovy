/**
 * @author ceilfors
 */
@RestController
class RestApplication {

    List<Person> persons = []

    @RequestMapping(value="/", method=RequestMethod.GET)
    List<Person> get() {
        persons
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    void post(@RequestBody Person person) {
        persons << person
    }


    @RequestMapping(value="/", method=RequestMethod.DELETE)
    void delete() {
        persons = []
    }
}

class Person {
    String name
    int age
}
