# TSC-task-2
![Image alt](http://publishernews.ru/images/PressReleases/press_r_34E7C198-ED6D-4243-B3E4-12882A5A701A.jpg)

>Даны 2 входных текстовых файла одинакового формата. В каждой строке содержатся данные в формате: <Целое число>,<Строка>.
>Требуется написать программу, которая объединяет списки по аналогии с right outer join в SQL, 
>т.е. для таблиц 
>	  A(ID integer, VALUE Char(100)) 
>	и B(ID integer, VALUE Char(100)) 
>возвращает результаты выполнения запроса
>	SELECT B.ID, A.VALUE, B.VALUE
>	  FROM A right outer join B on A.ID = B.ID
>
>В рамках задачи надо реализовать три разных алгоритма решения для разных вариантов хранения списков:
>1. ArrayList
>2. Отсортированный LinkedList
>3. HashMap
> 
>* Примечание. Читать данные из файла надо 1 раз, затем передавать данные из одной структуры хранения в другую.
>При решении задачи должна использоваться Java 7.
>
>Пример:
>```
>A			B
>ID	VALUE		ID	VALUE
>1	A		2	A
>2	C		4	B
>3	D		3	E
>```

_____________________________________________________________________________________________________
### Формат ввода:
**A.txt**
**B.txt**

### Формат вывода:
**result.txt**
>_____________________________________________________________________________________________________
