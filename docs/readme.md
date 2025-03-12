# Инструкция по запуску автотестов

## 1. Установка зависимостей

Перед запуском тестов убедитесь, что у вас установлены:
- **Java 21** (проверьте командой: `java -version`)
- **Maven** (проверьте командой: `mvn -version`)
- **Google Chrome** (проверьте, что браузер установлен)
- **ChromeDriver** (должен соответствовать версии Chrome, скачать: [Chromedriver](https://chromedriver.chromium.org/downloads))

### Установка ChromeDriver (Linux/macOS)
```bash
   CHROME_VERSION=$(google-chrome --version | grep -oE '[0-9.]+' | head -1)
wget https://chromedriver.storage.googleapis.com/$CHROME_VERSION/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
sudo mv chromedriver /usr/local/bin/
```
# Инструкция по запуску автотестов

## 1. Установка зависимостей

Перед запуском тестов убедитесь, что у вас установлены:

- **Java 21**  
  Проверьте установку командой:
  ```bash
  java -version
Maven
Проверьте установку командой:
```bash
  mvn -version
 ```
Google Chrome
Убедитесь, что браузер установлен.

ChromeDriver
Должен соответствовать версии Chrome.
Скачать можно по ссылке:
https://chromedriver.chromium.org/downloads

# 2. Клонирование репозитория
Если у вас ещё нет проекта, скачайте его с GitHub:

https://github.com/ravtaibov/selenium-automation

# 3. Запуск тестов
Запуск всех тестов
````bash
   mvn test
 ````
  Запуск тестов для agonagon.ru
````bash
  mvn -Dtest=agon.* test
  ````
   Запуск тестов по категориям:

  Общие тесты (заголовки, кнопки)

````bash
  mvn -Dtest=agon.general.* test
  ````
  Переходы по страницам

````bash
  mvn -Dtest=agon.navigation.* test
````
  Формы (логин, бронирование)

 ````bash 
    mvn -Dtest=agon.forms.* test
 ````
  Поиск
````bash
  mvn -Dtest=agon.search.* test
  ````
  Запуск тестов для example.com
````bash
  mvn -Dtest=example.* test
  ````
  Запуск тестов по категориям:
  Общие тесты (заголовки, кнопки)
````bash
  mvn -Dtest=example.general.* test
  ````
  Переходы по страницам
````bash
  mvn -Dtest=example.navigation.* test
  ````
  Формы (логин, контактная форма)
````bash
   mvn -Dtest=example.forms.* test
   ````
   Поиск
````bash
  mvn -Dtest=example.search.* test
  ````
 # 4. Просмотр отчётов
  После выполнения тестов можно проверить тестовую документацию:

Тестовая документация для agonagon.ru — docs/agon/
Тестовая документация для example.com — docs/example/
Если тесты упали, ошибки можно посмотреть в терминале.

