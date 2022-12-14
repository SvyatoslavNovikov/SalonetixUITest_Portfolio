#language:ru

Функционал: SLNX-2677 Вывод имени пользователя и чекбокса в меню регистрации

  @s2677
  @t2682
  @regression
  @клиентФронт
  @Авторизация
  @Регистрация

  Сценарий: SLNX-2682 Если пользователь был зарегистрирован ранее, в окне ввода смс не должен выводится чекбокс

    Пусть совершен переход на страницу "главная страница пользовательской части" по ссылке "clientMainPage"
      И выполнено нажатие на кнопку "войти" в блоке "шапка"
      И выполнено ожидание в течение 1 секунд
      И выполнено нажатие на кнопку "регистрация" в блоке "авторизация"
      И выполнено ожидание в течение 1 секунд
      И в поле "имя" в блоке "регистрация" введено значение "тест"
      И в поле "телефон" в блоке "регистрация" введено значение "9266205007"
      И выполнено нажатие на кнопку "получить пароль" в блоке "регистрация"
      И выполнено ожидание в течение 1 секунд
      Тогда элемент "чекбокс" не отображается в блоке "ввода смс"

  @s2677
  @t2682
  @regression
  @клиентФронт
  @Авторизация
  @Регистрация

  Сценарий: SLNX-2682 Если пользователь был зарегистрирован ранее, в окне ввода смс к нему должно быть обращение по имени

    Пусть совершен переход на страницу "главная страница пользовательской части" по ссылке "clientMainPage"
    И выполнено нажатие на кнопку "войти" в блоке "шапка"
    И выполнено ожидание в течение 1 секунд
    И выполнено нажатие на кнопку "регистрация" в блоке "авторизация"
    И выполнено ожидание в течение 1 секунд
    И в поле "имя" в блоке "регистрация" введено значение "тест"
    И в поле "телефон" в блоке "регистрация" введено значение "9266205007"
    И выполнено нажатие на кнопку "получить пароль" в блоке "регистрация"
    И выполнено ожидание в течение 1 секунд
    Тогда элемент "обращение" в блоке "ввода смс" содержит внутренний текст "Святослав"


  @s2677
  @t2680
  @regression
  @клиентФронт
  @Авторизация
  @Регистрация

  Сценарий: SLNX-2680 При клике на "Пользовательское соглашение" в новой вкладке должно открываться соглашение

    Пусть совершен переход на страницу "главная страница пользовательской части" по ссылке "clientMainPage"
    И выполнено нажатие на кнопку "войти" в блоке "шапка"
    И выполнено ожидание в течение 1 секунд
    И выполнено нажатие на кнопку "регистрация" в блоке "авторизация"
    И выполнено ожидание в течение 1 секунд
    И в поле "имя" в блоке "регистрация" введено значение "тест"
    И в поле "телефон" в блоке "регистрация" введен тестовый номер телефона
    И выполнено нажатие на кнопку "получить пароль" в блоке "регистрация"
    И выполнено ожидание в течение 1 секунд
    И выполнено нажатие на поле "пользовательского соглашения" в блоке "ввода смс"
    И выполнено ожидание в течение 2 секунд
    Тогда вкладка "пользовательское соглашение" загрузилась

  @s2677
  @t2679
  @regression
  @клиентФронт
  @Авторизация
  @Регистрация

  Сценарий: SLNX-2679 Если пользователь не был зарегистрирован ранее, ему должен выводится чекбокс в окне ввода смс

    Пусть совершен переход на страницу "главная страница пользовательской части" по ссылке "clientMainPage"
    И выполнено нажатие на кнопку "войти" в блоке "шапка"
    И выполнено ожидание в течение 1 секунд
    И выполнено нажатие на кнопку "регистрация" в блоке "авторизация"
    И выполнено ожидание в течение 1 секунд
    И в поле "имя" в блоке "регистрация" введено значение "тест"
    И в поле "телефон" в блоке "регистрация" введен тестовый номер телефона
    И выполнено нажатие на кнопку "получить пароль" в блоке "регистрация"
    И выполнено ожидание в течение 1 секунд
    Тогда элемент "пользовательского соглашения" отображается в блоке "ввода смс"

  @s2677
  @t2678
  @regression
  @клиентФронт
  @Авторизация
  @Регистрация

  Сценарий: SLNX-2678 Если пользователь не был зарегистрирован к нему должно выводится обращение по имени в окне ввода смс

    Пусть совершен переход на страницу "главная страница пользовательской части" по ссылке "clientMainPage"
    И выполнено нажатие на кнопку "войти" в блоке "шапка"
    И выполнено ожидание в течение 1 секунд
    И выполнено нажатие на кнопку "регистрация" в блоке "авторизация"
    И выполнено ожидание в течение 1 секунд
    И в поле "имя" в блоке "регистрация" введено значение "тест"
    И в поле "телефон" в блоке "регистрация" введен тестовый номер телефона
    И выполнено нажатие на кнопку "получить пароль" в блоке "регистрация"
    И выполнено ожидание в течение 1 секунд
    Тогда элемент "обращение" в блоке "ввода смс" содержит внутренний текст "тест"

  @s2677
  @t2720
  @regression
  @клиентФронт
  @Авторизация
  @Регистрация

  Сценарий: SLNX-2720 Должна появляться ошибка если пользователь не подтвердил пользовательское соглашение

    Пусть совершен переход на страницу "главная страница пользовательской части" по ссылке "clientMainPage"
    И выполнено нажатие на кнопку "войти" в блоке "шапка"
    И выполнено ожидание в течение 1 секунд
    И выполнено нажатие на кнопку "регистрация" в блоке "авторизация"
    И выполнено ожидание в течение 1 секунд
    И в поле "имя" в блоке "регистрация" введено значение "тест"
    И в поле "телефон" в блоке "регистрация" введен тестовый номер телефона
    И выполнено нажатие на кнопку "получить пароль" в блоке "регистрация"
    И выполнено ожидание в течение 1 секунд
    И в поле "введите код подтверждения" в блоке "ввода смс" введено значение "confirmCode"
    И выполнено нажатие на кнопку "зарегистрироваться" в блоке "ввода смс"
    И выполнено ожидание в течение 1 секунд
    Тогда элемент "ошибка чекбокса" отображается в блоке "ввода смс"

  @s2677
  @t2721
  @regression
  @клиентФронт
  @Авторизация
  @Регистрация

  Сценарий: SLNX-2721 Пользователь может зарегистрироваться если он принял пользовательское соглашение

    Пусть совершен переход на страницу "главная страница пользовательской части" по ссылке "clientMainPage"
    И выполнено нажатие на кнопку "войти" в блоке "шапка"
    И выполнено ожидание в течение 1 секунд
    И выполнено нажатие на кнопку "регистрация" в блоке "авторизация"
    И выполнено ожидание в течение 1 секунд
    И в поле "имя" в блоке "регистрация" введено значение "тест"
    И в поле "телефон" в блоке "регистрация" введен тестовый номер телефона
    И выполнено нажатие на кнопку "получить пароль" в блоке "регистрация"
    И выполнено ожидание в течение 1 секунд
    И в поле "введите код подтверждения" в блоке "ввода смс" введено значение "confirmCode"
    И выполнено нажатие на кнопку "чекбокс" в блоке "ввода смс"
    И выполнено нажатие на кнопку "зарегистрироваться" в блоке "ввода смс"
    И выполнено ожидание в течение 1 секунд
    Тогда элемент "имя пользователя" в блоке "шапка" содержит внутренний текст "тест"
