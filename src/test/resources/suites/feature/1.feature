#language: ru
@all
Функционал: Проверка работы сайта банка на :
  открытие основной страницы
  переход по вкладкам
  выбор чек-боксов
  нажать вкладку
@avtoru
  Структура сценария:
    Дано пользователь вводит в адресную строку браузера название сайта.
    Когда переход осуществлен, проверяем название страницы "Авто.ру".
    #пункт 2
    Тогда Сохранить количество объявлений, отображаемых перед названием "<производителя автомобиля>".
    И Перейти на страницу с объявлениям производителя автомобилей из п2.
    Когда Переход осуществлен. Отображается кнопка с текстом, содержащим количество объявлений из п2.
    #пункт 4
    Тогда Сохранить количество объявлений "<конкретной марки автомобиля>"
    Когда Перейти на страницу марки из п4
    Тогда Переход осуществлен. Отображается кнопка с текстом, содержащим количество объявлений модели из п4.

    Примеры:
      | производителя автомобиля | конкретной марки автомобиля |
      | Porsche                  | 911                         |
      | Ford                     | Focus                       |

@sber
  Сценарий:
    Дано пользователь вводит в адресную строку браузера название сайта Сбербанк.
    Тогда переход осуществлен, проверяем название страницы банка"«Сбербанк» - Частным клиентам".
    Когда  в верхней панели меню сайта нажимаем кнопку Вклады.
    Тогда переход осуществлен, название страницы "«Сбербанк» - Подбор вкладов".
    Когда нажать на вкладку "Подобрать вклад" .
    Тогда отображаются 4 чек-бокса
      | Хочу снимать   |
      | Хочу пополнять |
      | Онлайн         |
      | Я - пенсионер  |
    И Установлен чекбокс Онлайн ,отображается 3 вкладки
      | Вклад Сохраняй |
      | Вклад Пополняй |
      | Вклад Управляй |
    Когда выбрать чек-боксы Хочу снять, Хочу пополнять.
    Тогда во вкладах остались остался только
      | Вклад Управляй |
    Когда нажать на кнопку "Подробнее" вклад Управляй.
    Тогда открылось окно с названием "«Сбербанк» - Вклад Управляй".
    И странице отображается надпись "Вклад Управляй".