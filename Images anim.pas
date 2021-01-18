class Box {
    int width; 
    int height; 
    int depth; 

    Box(int a, int b) {
        width = a;
        height = b;
     
   depth = 10;
    }
    int getVolume() {
        return width * height * depth;
    }
}
<?php
  echo 'Hello, world!'; 
?>

function($args, $argsN) use ($ctxVar, $ctxVar1) { ... }

$a = 'I am a'; // Запись значения в переменную $a
echo $a; // Вывод переменной $а

$b = 'a';
echo $$b; // Вывод переменной $а (дополнительный $ перед переменной $b)

echo ${'a'}; // Вывод переменной $a

function_name(); // Вызов функции function_name
$c = 'function_name';
$c(); //Вызов функции function_name

$d = 'Class_name';
$obj = new Class_name; // Создание объекта класса Class_name
$obj = new $d(); // Создание объекта класса Class_name
$obj->b; // Обращение к свойству b объекта
$obj->c(); // Вызов метода c() объекта

$obj->$b; // Обращение к свойству a объекта, так как $b = 'a'
$obj->$c(); // Вызов метода function_name() объекта, так как $c = 'function_name'

class C1 extends C2 implements I1, I2
{
  private $a;
  protected $b;

  function __construct($a, $b)
  {
    parent::__construct($a, $b);
    $this->a = $a;
    $this->b = $b;
  }

  public function plus()
  {
    return $this->a + $this->b;
  }
/* ............... */
}

$d = new C1(1, 2);
echo $d->plus(); // 3

class a 
{
  public $color = 'red';
}

$a = new a();
echo $a -> color; // red
$b = $a;
$b -> color = 'blue';
echo $a -> color; // blue

<?php
class MyClass {
  const CONST_VALUE = 'Значение константы';
}
// Использование :: вне объявления класса
echo MyClass::CONST_VALUE;
?>

>>> str_var = "world"
>>> print("Hello, %s" % str_var)
Hello, world

>>> str_var = "world"
>>> print(f"Hello, {str_var}") # вывод с использованием f-строки
Hello, world

"строка и Юникод-строка одновременно"
'строка и Юникод-строка одновременно'
"""тоже строка и Юникод-строка одновременно"""
True or False  # булевы литералы
3.14  # число с плавающей запятой
0b1010 + 0o12 + 0xA  # числа в двоичной, восьмеричной и шестнадцатеричной системах счисления
1 + 2j  # комплексное число
[1, 2, "a"]  # список
(1, 2, "a")  # кортеж
{'a': 1, 'b': 'B'}  # словарь
{'a', 6, 8.8}  # множество
lambda x: x**2  # анонимная функция
(i for i in range(10)) # генератор

>>> class X(object): pass
…
>>> y = X()
>>> y.wrong_method()  # такого метода пока нет
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
AttributeError: 'X' object has no attribute 'wrong_method'
>>> X.wrong_method = lambda self : 'im here' # добавим его
>>> y.wrong_method() # так как доступ к методу приводит к поиску по __dict__ класса,
'im here' # то wrong_method становится доступным всем экземплярам

template <class Allocator> class Storage {
private:
  [[no_unique_address]] Allocator alloc;
};
[[nodiscard("причина")]] — указывает, что возвращаемое функцией значение нельзя игнорировать и выводит причину.
class Payload {};

class SmartPtr {
private:  
  [[nodiscard("Вы берётесь сами уничтожить результат")]] Payload* release();
};
[[likely]] / [[unlikely]] — отмечают, под какие ветви надо оптимизировать программу.
if (x > y) [[likely]] {
  std::cout << "Быстрее!" << std::endl;
} else {
  std::cout << "Медленнее!" << std::endl;
}