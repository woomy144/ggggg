class Box {
    box
     LLLLLLL
        KKKKKKKKKK
        OOOOOOOOO
        LLLLLLLLLL
        OOOOOOOOO
        ccccccccccccc
        aaaaaaaaaaaaaa
        llllllllllll
        
        
        
        
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

$a = 'I am a'; // Çàïèñü çíà÷åíèÿ â ïåðåìåííóþ $a
echo $a; // Âûâîä ïåðåìåííîé $à

$b = 'a';
echo $$b; // Âûâîä ïåðåìåííîé $à (äîïîëíèòåëüíûé $ ïåðåä ïåðåìåííîé $b)

echo ${'a'}; // Âûâîä ïåðåìåííîé $a

function_name(); // Âûçîâ ôóíêöèè function_name
$c = 'function_name';
$c(); //Âûçîâ ôóíêöèè function_name

$d = 'Class_name';
$obj = new Class_name; // Ñîçäàíèå îáúåêòà êëàññà Class_name
$obj = new $d(); // Ñîçäàíèå îáúåêòà êëàññà Class_name
$obj->b; // Îáðàùåíèå ê ñâîéñòâó b îáúåêòà
$obj->c(); // Âûçîâ ìåòîäà c() îáúåêòà

$obj->$b; // Îáðàùåíèå ê ñâîéñòâó a îáúåêòà, òàê êàê $b = 'a'
$obj->$c(); // Âûçîâ ìåòîäà function_name() îáúåêòà, òàê êàê $c = 'function_name'

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
  const CONST_VALUE = 'Çíà÷åíèå êîíñòàíòû';
}
// Èñïîëüçîâàíèå :: âíå îáúÿâëåíèÿ êëàññà
echo MyClass::CONST_VALUE;
?>

>>> str_var = "world"
>>> print("Hello, %s" % str_var)
Hello, world

>>> str_var = "world"
>>> print(f"Hello, {str_var}") # âûâîä ñ èñïîëüçîâàíèåì f-ñòðîêè
Hello, world

"ñòðîêà è Þíèêîä-ñòðîêà îäíîâðåìåííî"
'ñòðîêà è Þíèêîä-ñòðîêà îäíîâðåìåííî'
"""òîæå ñòðîêà è Þíèêîä-ñòðîêà îäíîâðåìåííî"""
True or False  # áóëåâû ëèòåðàëû
3.14  # ÷èñëî ñ ïëàâàþùåé çàïÿòîé
0b1010 + 0o12 + 0xA  # ÷èñëà â äâîè÷íîé, âîñüìåðè÷íîé è øåñòíàäöàòåðè÷íîé ñèñòåìàõ ñ÷èñëåíèÿ
1 + 2j  # êîìïëåêñíîå ÷èñëî
[1, 2, "a"]  # ñïèñîê
(1, 2, "a")  # êîðòåæ
{'a': 1, 'b': 'B'}  # ñëîâàðü
{'a', 6, 8.8}  # ìíîæåñòâî
lambda x: x**2  # àíîíèìíàÿ ôóíêöèÿ
(i for i in range(10)) # ãåíåðàòîð

>>> class X(object): pass
…
>>> y = X()
>>> y.wrong_method()  # òàêîãî ìåòîäà ïîêà íåò
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
AttributeError: 'X' object has no attribute 'wrong_method'
>>> X.wrong_method = lambda self : 'im here' # äîáàâèì åãî
>>> y.wrong_method() # òàê êàê äîñòóï ê ìåòîäó ïðèâîäèò ê ïîèñêó ïî __dict__ êëàññà,
'im here' # òî wrong_method ñòàíîâèòñÿ äîñòóïíûì âñåì ýêçåìïëÿðàì

template <class Allocator> class Storage {
private:
  [[no_unique_address]] Allocator alloc;
};
[[nodiscard("ïðè÷èíà")]] — óêàçûâàåò, ÷òî âîçâðàùàåìîå ôóíêöèåé çíà÷åíèå íåëüçÿ èãíîðèðîâàòü è âûâîäèò ïðè÷èíó.
class Payload {};

class SmartPtr {
private:  
  [[nodiscard("Âû áåð¸òåñü ñàìè óíè÷òîæèòü ðåçóëüòàò")]] Payload* release();
};
[[likely]] / [[unlikely]] — îòìå÷àþò, ïîä êàêèå âåòâè íàäî îïòèìèçèðîâàòü ïðîãðàììó.
if (x > y) [[likely]] {
  std::cout << "Áûñòðåå!" << std::endl;
} else {
  std::cout << "Ìåäëåííåå!" << std::endl;
}
