// Основная функция...
fun main(args: Array<String>) {

}


// Объявление и инициализация переменной...
var age: Int = 27

// Сдвиг влево...
var age2 = 30 shl 1

// Сдвиг другого типа...
var age3 = 30 ushr 1

// Объявление символьной переменной...
var gender = 'm'

// Объявление константы для чтения...
const val maxAge = 150


// Операция прибавления числа к элементу...
age += 1


// Вывод переменной...
println(age)

// Вывод строки...
println("Hello world!")


// Объявление переменной, позволяющее содержать любой тип...
var anyVariable: Any

anyVariable = "10"
anyVariable = 5
anyVariable = '4'


// Остаток от деления...
println(50%3)


// Условный оператор...
if (age === age2)
   println("Не ссылаются на один объект")


// Аналог switch...
val result = when(age) {
  6, 18, 21 -> {
    println("New stage")
  }
  // Интервал значений...
  in 17.. 27 -> println("Your age between 17 and 27")

  // Противоположный интервал...
  !in 17.. 27 -> println("Your age less than 17 or more than 27")
   
  else -> println("Else condition")
}


// Цикл с одним переменной счетчика...
for (i in 1..10)
   print("${i*i} \t")

// Цикл с двумя переменными счетчика...
for (i in 1..10) {
   for (j in 1..10)
       print("${i * j} \t")
   println();
}


// Цикл с предусловием...
var i = 10
while (i > 0) {
   println(i)
   i--
}

// Цикл с постусловием...
i = 10
do {
   i--
   println(i)

   // Выход из цикла...
   break

   // Перейти к следующей итерации...
   continue

   println();
} while (i > 0)


// Генерация чисел и символов в диапозоне...
var range = 1..100
var charRange = 'a'..'z'

// Обратная последовательность...
var rangeBack = 1000 downTo 100

// Последовательность с шагом...
var intRangeStep = 1..100 step 3

// Последовательность, не включающая границу...
range = 1 until 100

// Проверка нахождения числа в последовательности...
var isRange = 5 in range
println("Is range: $isRange")

// Создание массива...
val mass: Array<Int> = arrayOf(1, 2, 3, 4, 5)

// Получение элемента массива по индексу...
val n = mass[1]

// Cоздание массива из 5 нулей...
val massZeros = Array(5) {0}

// Создание целочисленного массива...
val intMass = IntArray(7)

// Проверка числа в массиве...
println(4 in mass)


// Создание двумерного массива 3x5, заполненного нулями...
val matrix: Array<Array<Int>> = Array(3) { Array(5, { 0 }) }

// Инициализация первой строки массива...
matrix[0] = arrayOf(1, 2, 3, 4, 5)

// Присовение элементу массива числа...
matrix[0][4] = 21


// Обход одномерного массива и вывод элементов...
for (element in mass)
   println(element)

// Обход двумерного массива и вывод элементов...
for (row in matrix) {
   for (cell in row)
       print("$cell ")
   println()
}


// Присвоение переменной значение функции и передача переменной в строку вывода...
var f = factorial(4)
println("Factorial off 4 = ${factorial(4)}")
println()
println("Factorial off 4 = $f")

// Перегрузка функции, для нескольких параметров...
printStrings("str1")
printStrings("str1", "str2")
printStrings("str1", "str2", "str3")


val names = arrayOf("Tom", "Bob", "Alice")

// Для передачи массива в функцию используется знак *
printNames(3, *names)

// Перегрузка функции, для разных типов параметров...
println("Square of 17 is ${square(17)}")
println("Square of 3.5 is ${square(3.5f)}")


// Функция принимает переменное число параметров...
fun printStrings(vararg strings: String){
    for (str in strings)
        println(str)
}

// Функция принимает и возвращает целое число...
fun factorial2(n: Int): Int {
  var result = 1

  for (d in result..n)
      result *= d

  return result
}

// Функция принимает в начале определенное количество параметров, затем неопределенное...
fun printNames(count: Int, vararg names: String){
  println("Count: $count")
  for (name in names)
      print("$name ")
}

// Однострочная функция...
fun square(x: Int) :Int = x*x

// Перегрузка функции square...
fun square(x: Float) = x*x