﻿Здраствуйте, 

Сначала, извините все ошибки по орфографии и грамматике. Я поляк и всё ещё учусь этот сложный язык. Буду вас благодарить за каждое изправление.

Итак, идеа турниров отлична! В этом курсе чуствую между студентами интеракцию каторой ещё не видел по других курсах. Я поздравляю создатели курса и профессора тем более что это происходить из России а нет х США!

Хотя у нас не было никаких указании перед первым турниром всё равно, я думал много и наконец  выибрал стратегию [5, 16, 5, 16, 16, 5, 16, 16, 5]. Я был 424 в первом турнире и я получил 6 баллов. Можно было лучше

Но когда я увидел что будеть второй турнир Блотто и что у нас есть результаты первого турнира я взял eclipse + java (есть больше програмистов здесь?) и начал анализировать файл excel. 

В первом турнире я подумал что лучше всего сделать два типа отрядов: 
-с многими солдатами (первой тип)
-с немногимс солдатами (второй тип)
при чем лучше иметь болше отрядов первого типа. Почему я подумал что лучше иметь только два типа отрядов? Потому что допустил что, в среднем, на каждом полу будеть всегда тоже самое количество солдатов. И действительно так было (более или менее). Вот средняя стратегия:
[9.99, 10.60, 11.61, 11.74, 12.54, 11.60, 11.13, 10.52, 10.24]
Как видите наиболее студенты выибирали середину (как сказал профессор), но разница не так большая.

Потом я сделал програм который создаёт стратегии з нижеперечисленными cобственностями.
-  Каждвя стратегия имеет два типа отрядов
-  Каждая стратегия имеет от 5 до 8 отрядов первово типа
-  Отряд первого типа каждой стратегии имеет от 11 до 18 солдатов (если ето возможно)

Затем я потосовал стратегии так что получил почти каждую возможную стратегию с даными отрядами.

Например стратегия [15, 15, 15, 15, 15, 15, 3, 3, 4] по тасованию может выглядить так [15, 3, 15, 4, 15, 3, 15, 15, 15].

Потом все эти стратегии положил в борьбу с результатами первого турнира. 

Оказалось, что симулацию выиграла стратегия [5, 13, 13, 13, 4, 13, 13, 13, 13], почти тоже самая которая выиграла певрый турнир. 

Конечно это недостаточно скопировать наилучшую стратегию первого турнира. Может быть лучше найти стратегию каторая бы выиграла c первую пятисотку стратегии из первого турнира. Так я зделал или хотел зделать, потому, что я просто забыл послать мою стратегию (Корсере на хватает хорошего система напоминания о дедлайнах! Когда делаешь 7 курсов одновременно и ещё работаешь на полный рабочий день это большая пролема!). Немного жал, получилобысь max... Но самое важноу это что я выучил.

Я должен был ждать до выпуска результатов чтобы представить мой програм без нарущения хонор коуда, но надеюсь что сейчас могу поделиться ссылкой.

Вот мое GitHub repository одкуда вы можете скачать сорс коуд моего программа:
https://github.com/GA1/Algorithms/tree/master/Coursera/Higher%20School%20of%20Economics/Blotto%20Tournament

и его output:
BLOTTO I

Mean strategy from the 1st tourn is: [9.99, 10.6, 11.61, 11.74, 12.54, 11.6, 11.14, 10.52, 10.24]
My best strategy against all the strategies from the 1st tournament: [5, 13, 13, 13, 4, 13, 13, 13, 13], and its score: 17801.0
The best strategy from the 1st tournament: [3, 14, 14, 13, 3, 13, 13, 14, 13], and its score: 17824.0
My best strategy against 500 best strategies from the 1st tournament: [4, 17, 17, 17, 4, 17, 3, 17, 4], and its score: 17163.0
 

BLOTTO II

Mean strategy from the 2nd tourn is: [8.94, 11.73, 12.27, 11.96, 8.81, 12.28, 12.14, 11.59, 10.27]
The best strategy from the 2st tournament: [4, 17, 17, 17, 4, 17, 17, 3, 4], and its score: 7440.0
My best strategy: [4, 17, 17, 17, 4, 17, 3, 17, 4], and its score: 7441.5
Очень интересно как сильно влияют на второй турнир слова профессора (разница солдатов в пятом поле)!

Спасиба за каждый совет и мнение!
