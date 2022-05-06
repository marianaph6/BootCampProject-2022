package TiposDato

import platform.windows.byte

class TiposDato{

    fun main(){
        println()
        println("BYTES")
        BytesEjemplo()
        println("SHORT")
        ShortEjemplo()
        println("INT")
        IntEjemplo()
        println("LONG")
        LongEjemplo()
        println("FLOAT")
        FloatEjemplo()
        println("DOUBLE")
        DoubleEjemplo()
        println("CHAR")
        CharEjemplo()
        println("STRING")
        StringEjemplo()
        println("BOOLEANO")
        BooleanEjemplo()
        println()
    }

        fun BytesEjemplo (){

            //Edad
            val edad: Byte = 15

            //Numero de semestres
            val semestres: Byte=10

            //Cantidad de letras abecedario
            val tamAbecedario: Byte =26

            println("Bytes: Edad: $edad  Semestres: $semestres #Letras abecedario: $tamAbecedario")
        }

        fun ShortEjemplo (){

            //Meses de nacimiento
            val mesesNac: Short = 1500

            //Días del año
            val diasAnio: Short = 365

            println("Shorts: Meses de nacimiento: $mesesNac  Días del año: $diasAnio")
        }

        fun IntEjemplo (){

            //Numeros seriales
            val numSerial: Int= 66406545

            //Dias de siglo
            val diasSiglo: Int= 36526

            //Capacidad estadio
            val capEstadio: Int= 1800000

            println("Enteros: Numeros seriales: $numSerial  Dias de siglo: $diasSiglo Capacidad estadio: $capEstadio")

        }

        fun LongEjemplo (){

            //Masa
            val masa: Long= 178823411

            //Distancia Luna
            val distLuna: Long=384400000

            println("Longs: Masa: $masa  Distancia Luna: $distLuna")
        }

        fun FloatEjemplo (){

            //Peso
            val peso: Float =71.6F

            //Estatura
            val estatura: Float =163.5F

            //Medidas
            val medida: Float =70.6F

            //Diametro
            val diametro: Float =100.7F

            println("Floats: Peso: $peso  Estatura: $estatura #Medidad: $medida  Diametro: $diametro")

        }

        fun DoubleEjemplo (){

            //Temperatura
            val temperatura: Double= 12.2357

            println("Doubles: Temperatura: $temperatura")

        }

        fun CharEjemplo (){

            //Letra favorita
            val letraFavorita: Char= 'Z'

            //Inicial Nombre
            val inicialNombre: Char= 'M'

            println("Chars: Letra favorita: $letraFavorita  Inicial Nombre: $inicialNombre")

        }

        fun StringEjemplo (){

            //Nombre
            val nombre: String= "Mariana"

            //Materia
            val materia: String= "Humanidades"

            println("Strings: Nombre: $nombre  Materia: $materia")

    }

        fun BooleanEjemplo () {

            //Materia ganada
            val materiaGanada: Boolean = true

            //Bombillo encendido
            val bombilloOn: Boolean = false

            println("Booleanos: Materia ganada: $materiaGanada  Bombillo encendido: $bombilloOn ")


        }


}