package Clases;

import java.util.Scanner;

public class Preguntas {

    public static void main(String[] args) {

        Pregunta[] preguntas = {

            new Pregunta("Los investigadores del caso después un largo tiempo encontraron la guarida del Hacker con una seguridad basada en la programación, para poder rebasar dicha seguridad tienes que usar la POO. Buena suerte!!!  \n\nPara abrir la puerta responde:\nSi quieres distribuir tu aplicación a diferentes plataformas¿cuántas versiones de Java necesitas crear?:", new Respuesta[] {

                    new Respuesta("Sólo una version\n",'A', true),
                    new Respuesta("Una version para cada plataforma\n",'B', false),
                    new Respuesta("Dos versiones\n",'C', false)

            }),

            new Pregunta("Para poder desactivar los rayos láser responde:\nNetBeans es un lenguaje de programación", new Respuesta[] {

                    new Respuesta("Verdadero\n", 'A', false),
                    new Respuesta("Falso\n", 'B', true),

            }),

            new Pregunta("Para poder desactivar la cámara responde:\n¿Qué modificador de acceso indica explícitamente que un método o variable de un objeto puede ser accedido por código fuera de la clase de ese objeto?\n", new Respuesta[] {

                    new Respuesta("public\n", 'A', true),
                    new Respuesta("static\n", 'B', false),
                    new Respuesta("default\n", 'C', false),
                    new Respuesta("private\n", 'D', false),

            }),

            new Pregunta("Te has encontrado con un cyberperro guardian tienes que cruzarle los cables respondiendo lo siguiente:\nCuál es la salida del siguiente codigo:\nclassA{\n\tprivate void print(){\n\t\tSystem.out.println(´´a´´);\n\t}\n\tprivate void print(String str){\n\t\tSystem.out.println(´´b´´);\n\t}\n\tprivate void print(int x){\n\t\tSystem.out.println(´´c´´);\n\t}\n\tpublic static void main(String[]args){\n\t\tA object=new A();\n\t\tobject.print(12);\n\t}\n}", new Respuesta[] {

                    new Respuesta("a\n", 'A', false),
                    new Respuesta("b\n", 'B', false),
                    new Respuesta("c\n", 'C', true),
            }),
            new Pregunta("Estas a una pregunta de salvar el mundo responde: \nUna clase Car y su subclase BMW tienen cada uno un método run(), el cual fue escrito por el desarrollador como parte de la definición de la clase. Si CarObj hace referencia a un objeto del tipo BMW,¿qué hará CarObj.run();?", new Respuesta[] {

                    new Respuesta("Invocará el método run() definido en Car\n", 'A', false),
                    new Respuesta("El compilado se quejará de que run() ha sido definido dos veces\n", 'B', true),
                    new Respuesta("Invocará el método run() definido en BMW\n", 'C', false),

            })
        };
      

        for (Pregunta p: preguntas) {
           p.preguntar();
        }
    }
}

class Pregunta {

    private String pregunta;
    private Respuesta[] respuestasPosibles;
    public Pregunta(String pregunta, Respuesta[] respuestasPosibles) {
        this.pregunta = pregunta;
        this.respuestasPosibles = respuestasPosibles;
    }

    public void preguntar() {
        System.out.println(this.pregunta);
        char letraCorrecta = 'A';
        for (Respuesta opcion: this.respuestasPosibles) {
            if (opcion.esCorrecta()) letraCorrecta = opcion.getLetra();
            System.out.print(String.valueOf(opcion.getLetra()) + ")" + opcion.getRespuesta() + "");
        }
        System.out.println("\nElige: ");
        Scanner sc = new Scanner(System.in);
        char letraElegidaPorElUsuario = sc.next().toUpperCase().charAt(0);
        if (letraElegidaPorElUsuario == letraCorrecta)
            System.out.println("Correcto");
        else

            System.out.println("Incorrecto, la respuesta correcta era " + String.valueOf(letraCorrecta));
            System.out.println("");

    }

}




class Respuesta {

    private String respuesta;
    private char letra;
    private boolean correcta;

    public Respuesta(String respuesta, char letra, boolean correcta) {
        this.respuesta = respuesta;
        this.letra = letra;
        this.correcta = correcta;
    }

    public String getRespuesta() {
        return this.respuesta;

    }

    public char getLetra() {
        return this.letra;
    }

    public boolean esCorrecta() {
        return this.correcta;
    }
}
