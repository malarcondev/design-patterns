## Patron Singleton
> Con el patron singleton se pretende evitar crear nuevas instancias. Una vez intanciado una clase y decidamos volver instanciar, singleton sugiere que se use la 1ra instancia.
> El objetivo que no permita crear mas instancias de la clase y ahorrar espacio en memoria.

**Example:**
- BAD:
```
public class Main {
  public static void main(String[] args) {
    Singleton singleton = new Singleton();
    singleton.setContador(15);
    System.out.println(singleton.getContador());
    System.out.println(singleton);
    }
  }
```
- GOOD:
```
public class Main {
  public static void main(String[] args) {
  Singleton singleton = Singleton.getInstance();
    singleton.setContador(15);
    System.out.println("Valor : " + singleton.getContador() + " en memoria" + singleton);
    }
  }
```