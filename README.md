# TestGlobant

Android app that implements a search UI with debounced results.

## Features

- **Search screen** — Text input with a list of search results
- **Debounced search** — 300 ms debounce on query changes for better performance
- **Simulated search** — Mock search results with configurable delay (no API or database yet)

## Tech Stack

| Category      | Technology                  |
|---------------|-----------------------------|
| **UI**        | Jetpack Compose, Material 3 |
| **DI**        | Hilt                        |
| **Architecture** | MVVM (ViewModel + StateFlow) |
| **Language**  | Kotlin, JVM 11              |
| **Code generation** | KSP                    |
| **Target**    | minSdk 28, compileSdk 36    |

## Project Structure

```
app/src/main/java/dev/alexrincon/testglobant/
├── MainActivity.kt          # Hilt entry, Compose root
├── SearchApplication.kt     # @HiltAndroidApp
├── ui/
│   ├── SearchScreen.kt     # Search UI (TextField + LazyColumn)
│   └── SearchViewModel.kt   # Search state and debounce logic
├── data/
│   └── SearchRepository.kt # Mock search Flow
└── core/ui/theme/
    ├── Theme.kt
    ├── Color.kt
    └── Type.kt
```

## How It Works

1. User types in the search bar → `SearchViewModel.onQueryChange()` updates the query state
2. The query is debounced (300 ms) and used to trigger a new search via `flatMapLatest`
3. `SearchRepository.search(query)` returns mock results as a `Flow` with simulated delay
4. Results are exposed as `StateFlow` and displayed in the `LazyColumn` on `SearchScreen`

## Requirements

- Android Studio Ladybug (2024.2.1) or newer
- JDK 11+

## Building

```bash
./gradlew assembleDebug
```

## License

Private project for evaluation purposes.
