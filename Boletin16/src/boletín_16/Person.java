
package boletín_16;

/**
 *
 * @author crist
 */
public class Person{

                            //ATRIBUTS
   /* private String name;
      private String surname;
      private String NIF;
   */
    private String name, surname, NIF;
    
        //contructores

    public Person() {
    }

    public Person(String name, String surname, String NIF) {
        this.name = name;
        this.surname = surname;
        this.NIF = NIF;
    }
        //setters & getters

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNIF() {
        return NIF;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    
    
}
