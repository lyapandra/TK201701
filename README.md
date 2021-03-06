Course # TK201701
===========
Install:
===========
1.1. Mint
    https://www.linuxmint.com/download.php
    
1.2. JVM
    http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
    
1.3. BlueJ*
    http://www.bluej.org/
    
1.4. IntelliJ*
    https://www.jetbrains.com/idea/download/#section=linux. Для встановлення IntelliJ потрібно  
    _(перелік кроків пишу по пам'ятті і не з під Ubuntu. Тому для полегшення встановлення програми іншим, ті хто зараз встановлює, запишіть у свою гілку в README.md або складності які виникають, або уточнену інформацію [наприклад я вже не пам'ятаю точну назву розархівованого каталогу], або термінальні команди, які ви успішно виконали):_  
        1. скачати. За замовчуванням в каталог ~/Downloads  
        2. розархівувати  
        3. створити каталог для встановлення. Рекомендую в папці /opt/. Робота в каалозі дозволяється з правами root. Тому перед командами пишіть sudo   
        4. cкопіювати з ~/Downloads в /opt/  
        5. запустити /opt/IntelliJ/bin/IntelliJ.sh  

```sh
./intelliJ.sh
```
    
1.5. git

1.6. SmartGit* 
    http://www.syntevo.com/smartgit/download
    which git (/usr/bin)

Зірочка (*) - даний пункт виконується за бажанням

=============
Task #1:
=============
2.1. Клонувати проект https://github.com/lyapandra/TK201701

2.2. Створити власну гілку. Гілку назвати за шаблоном "№ за журналом.Прізвище.Версія". Наприклад: "08.Kovalik.01". Зміни гілки master будуть ліквідовуватися без аналізу змін.

2.3. На вашу скриньку прийшли листи із посиланням на лекцію 01 https://docs.google.com/document/d/1n8I1AA5ZZ1R-BimC9PXTJhrdfMax9ZT-U1xDDHHgv1I/edit?usp=sharing .
Є багато різного матеріалу по Java, проте в цьому лаконічно подано матеріал, який дасть вам можливість вивчити Java. Проте в мене він лише в друвованому вигляді. Я його відсканував, розпізнав і програмно переклав. Там є неточності перекладу. Тому ви можете резервувати цілу кількість сторінок, вказати це у документі https://docs.google.com/document/d/1UNNV74KyZ9l80DbE-gW0mxGpEfHVKbZVNPjqM3SLH7g/edit?usp=sharing (щоб не конфліктувати з іншими студентами) та вносити правки. Я буду бачити і враховувати роботу кожного. Якщо ви бачете, що певні помилкові слова можуть повторюватися і в інших лекціях, то вписуєте їх в документ https://docs.google.com/document/d/1n8I1AA5ZZ1R-BimC9PXTJhrdfMax9ZT-U1xDDHHgv1I/edit?usp=sharing для того, щоб я зробив автозаміну (відповідно студентам буде менше роботи)

2.4. Читаєте лекцію

2.5. Приклади з лекії копіпастите в Java-редактор, виправляєте помилки і аналізуєте результат виконання

2.6. Успішно виконаний проект пушите у власну гілку

2.7. Повторюєте п. 2.4-2.6

=============
Task #2:
=============
## Лекція 1:
####Знати:
1.	Об'єкт
2.	Клас
3.	Принципи ООП та вміти їх пояснити
4.	Механізм «пізнього зв'язування»
5.	Ключові і зарезервовані слова мови Java
6.	Нововведення версій
7.	Порівняння об'єктів
Вміти виконувати завдання аналогічні до прикладів # 1 – 11

####Результатом опрацювання лекції №1 є те, що кожен студент повинен постаратися написати і скомпілювами програму (згідно з номером у журналі):
  1.  Створити клас Hello,який буде вітати будь-якого користувача, використовуючи командний рядок.
  2.  Створити додаток, яке відображає у вікні консолі аргументи командного рядка методу main () в зворотному порядку.
  2.  Створити додаток, що виводить n рядків з переходом і без переходу на новий рядок.
  2.  Створити додаток для введення пароля з командного рядка і порівняння його з рядком-зразком.
  2.  Створити програму введення цілих чисел як аргументів командного рядка, підрахунку їх суми (твори) і виведення результату на консоль.
  2.  Створити додаток, що виводить прізвище розробника, дату і час отримання завдання, а також дату і час здачі завдання. Для отримання останньої дати і часу використовувати клас Calendar з пакета java.util.
  2.  Створити аплет на основі попереднього завдання і запустити його за допомогою HTML-документа.
Ввести з консолі n цілих чисел і помістити їх в масив. На консоль вивести:
  2.  Парні і непарні числа.
  2.  Найбільше і найменше число.
  2.  Числа, які діляться на 3 або на 9.
  2.  Числа, які діляться на 5 і на 7.
  2.  Елементи, розташовані методом бульбашки спаданням модулів.
  2.  Всі тризначні числа, в десятковому записі яких немає однакових цифр.
  2.  Найбільший спільний дільник і найменше спільне кратне цих чисел.
  2.  Прості числа.
  2.  Відсортовані числа в порядку зростання і зменшення.
  2.  Числа в порядку убування частоти появи чисел.
  2.  Числа Фібоначчі: f0 = f1 = 1, f (n) = f (n-1)  2.  f (n-2).
  2.  Числа-паліндроми, значення яких в прямому і зворотному порядку збігаються.
  2.  Елементи, які дорівнюють півсумі сусідніх елементів.
  2.  Період десяткового дробу p = m / n для перших двох цілих позитивних чисел n і m,розташованих підряд.
  2.  Побудувати трикутник Паскаля для першого позитивного числа. 

#### Провести аналіз коду за алгоритмічним критерієм https://github.com/teamed/quiz/blob/master/Parser.java

## Лекція 2:
Знати:
1.	Базові типи даних і літерали
2.	Документування коду
3.	Оператори
4.	Арифметичні оператори
5.	Бітові оператори над цілочисельними типами
6.	Оператори відносини
7.	Класи-оболонки
8.	Оператори управління
9.	Массивы
10.	Класс Math
11.	Керування додатком

=============
TO READ
=============
1. http://docs.oracle.com/javase/8/docs/
2. Лекція 01
3. Лекція 02
