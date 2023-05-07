/*
Un profesor particular está dando cursos para grupos de cinco alumnos y 
necesita un programa para organizar la información de cada curso. Para ello, 
crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso,
cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. 
A continuación, se implementarán los siguientes métodos:
Un constructor por defecto.
Un constructor con todos los atributos como parámetro.
Métodos getters y setters de cada atributo.
Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta 
información en un arreglo e iterar con un bucle, solicitando en cada repetición
que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los
atributos al usuario y después se le asignan a sus respectivos atributos para
llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la 
ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de 
días a la semana que se repite el encuentro.
 */
package Entidad;



    /**
     * clase entidad llamada Curso, cuyos atributos serán: nombreCurso,
     * cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),
     * precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de
     * dimensión 5 (cinco), donde se alojarán los nombres de cada alumno
     *
     * @author lucas
     */
    public class Curso {

        private String nombreCurso;
        private double cantidadHorasPorDia;
        private int cantidadDiasPorSemana;
        private String turno;
        private double precioPorHora;
        private String[] alumnos = new String[5];


        public Curso() {
        }

        public Curso(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
            this.nombreCurso = nombreCurso;
            this.cantidadHorasPorDia = cantidadHorasPorDia;
            this.cantidadDiasPorSemana = cantidadDiasPorSemana;
            this.turno = turno;
            this.precioPorHora = precioPorHora;
            this.alumnos = alumnos;
        }

        public String getNombreCurso() {
            return nombreCurso;
        }

        public double getCantidadHorasPorDia() {
            return cantidadHorasPorDia;
        }

        public int getCantidadDiasPorSemana() {
            return cantidadDiasPorSemana;
        }

        public String getTurno() {
            return turno;
        }

        public double getPrecioPorHora() {
            return precioPorHora;
        }

        public String[] getAlumnos() {
            return alumnos;
        }

        public void setNombreCurso(String nombreCurso) {
            this.nombreCurso = nombreCurso;
        }

        public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
            this.cantidadHorasPorDia = cantidadHorasPorDia;
        }

        public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
            this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        }

        public void setTurno(String turno) {
            this.turno = turno;
        }

        public void setPrecioPorHora(double precioPorHora) {
            this.precioPorHora = precioPorHora;
        }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }


}
