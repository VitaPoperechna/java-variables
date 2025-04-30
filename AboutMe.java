public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.

        //Escribe tu código aquí
        String name = "Vita";
        int age = 34;
        String country = "Ucrania";
        String programmingLanguage = "Java";
        int hours = 8;
        String hobby = "cantar";
        String place = "TikTok";

        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println("Mi nombre es " + name + ", tengo " + age + " años y soy de " + country + ".");

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando " + programmingLanguage + " y practico " + hours + " horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es " + hobby + " y lo practico en " + place);
    }
}
