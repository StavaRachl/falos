# FALOS

Minecraft Forge мод для Minecraft 1.20.1, добавляющий набор новых съедобных предметов и отдельную вкладку в креативном режиме.

## Возможности

Мод добавляет новые предметы питания различных типов:

### Обычные предметы

- Wood Penis
- Stone Penis
- Copper Penis
- Iron Penis
- Gold Penis
- Diamond Penis
- Emerald Penis
- Netherite Penis
- Sperma

### Магические предметы

- Fire Penis
- Blood Penis
- Ender Penis

### Особые предметы

- Ivan Penis
- Elder Guardian Penis

## Версии

| Компонент | Версия |
|-----------|---------|
| Minecraft | 1.20.1 |
| Forge | 47.4.20 |
| Java | 17 |

## Установка

### Для игроков

1. Установите Minecraft Forge 47.4.20 для Minecraft 1.20.1.
2. Скачайте собранный `.jar` файл мода.
3. Поместите его в папку `mods`.
4. Запустите игру через Forge.

## Сборка проекта

### Требования

- Java 17
- Git
- Gradle (или используйте встроенный Gradle Wrapper)

### Клонирование

```bash
git clone https://github.com/StavaRachl/falos
cd falos
```

### Сборка

Linux / macOS:

```bash
./gradlew build
```

Windows:

```cmd
gradlew.bat build
```

После успешной сборки готовый файл будет находиться в:

```text
build/libs/
```

## Запуск среды разработки

Клиент Minecraft:

```bash
./gradlew runClient
```

Сервер Minecraft:

```bash
./gradlew runServer
```

## Структура проекта

```text
src/main/java/ru/stavarachi/falos
│
├── item/           # Реализация предметов
├── register/       # Регистрация предметов
├── tab/            # Креативная вкладка
├── command/        # Команды
├── event/          # События
├── config/         # Конфигурация
└── Falos.java      # Точка входа мода
```

## Регистрация контента

Для регистрации используется Forge Deferred Register:

- Предметы регистрируются в `ItemRegister`
- Креативная вкладка регистрируется в `PenisTab`
- Инициализация выполняется в `Falos`

## Лицензия

Проект распространяется под лицензией MIT

## Автор

Stavarachi