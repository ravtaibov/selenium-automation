# ===== ИНСТРУКЦИЯ ПО ЗАПУСКУ АВТОТЕСТОВ =====

# 1. УСТАНОВКА ЗАВИСИМОСТЕЙ
# - Убедитесь, что установлены:
#   * Java 21 (проверка: java -version)
#   * Maven (проверка: mvn -version)
#   * Google Chrome
#   * ChromeDriver (версия должна совпадать с Chrome: https://chromedriver.chromium.org/downloads)

# 2. КЛОНИРОВАНИЕ РЕПОЗИТОРИЯ
git clone https://github.com/ТВОЙ_ГИТХАБ/selenium-automation.git
cd selenium-automation

# 3. ЗАПУСК ТЕСТОВ

# Все тесты:
mvn test

# === Для сайта agonagon.ru ===
# Все тесты сайта:
mvn -Dtest=agon/* test

# Категории тестов:
# Общие тесты (заголовки, кнопки)
mvn -Dtest=agon.general/* test

# Переходы по страницам
mvn -Dtest=agon.navigation/* test

# Формы (логин, бронирование)
mvn -Dtest=agon.forms/* test

# Поиск
mvn -Dtest=agon.search/* test

# === Для сайта example.com ===
# Все тесты сайта:
mvn -Dtest=example/* test

# Категории тестов:
# Общие тесты (заголовки, кнопки)
mvn -Dtest=example.general/* test

# Переходы по страницам
mvn -Dtest=example.navigation/* test

# Формы (логин, контактная форма)
mvn -Dtest=example.forms/* test

# Поиск
mvn -Dtest=example.search/* test

# 4. ПРОСМОТР ОТЧЕТОВ
# Отчеты доступны в:
# - Для agonagon.ru: docs/agon/
# - Для example.com: docs/example/

# ПРИМЕЧАНИЯ:
# 1. Замените ТВОЙ_ГИТХАБ в URL репозитория
# 2. ChromeDriver должен быть в PATH или укажите путь в настройках
# 3. Для запуска конкретного класса: mvn -Dtest=ClassName test