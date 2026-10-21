# RollDice

行動應用軟體開發課堂練習，使用 Kotlin 與 Jetpack Compose。

目前版本：V5，修改作者姓名。

依下一份教材的 V5，將畫面作者改為謝秉育。

## 操作方式

- 單擊骰子：隨機顯示 1 到 6 點。
- 雙擊骰子：回到初始圖示。
- 長按骰子：固定顯示 6 點。

## 版本紀錄

| 版本 | 內容 |
|---|---|
| V0 | 初始專案：建立 Kotlin 與 Jetpack Compose 的 Empty Activity 專案。 |
| V1 | 基本介面：用 Column、Text、Spacer、Image 排出置中的骰子畫面。 |
| V2 | App 名稱與圖示：設定中文與英文 App 名稱，並以 dice0 作為 App 圖示。 |
| V3 | 點擊圖片隨機擲骰子：使用 remember 與 mutableStateOf 保存點數，單擊隨機顯示 1 到 6 點。 |
| V4 | 點擊、雙擊及長按圖片：使用 pointerInput 與 detectTapGestures，單擊擲骰子、雙擊歸零、長按固定為 6 點。 |
| V5 | 修改作者姓名：依下一份教材的 V5，將畫面作者改為謝秉育。 |

V0 至 V4 對應「04 版本管理與觸控」，V5 的作者姓名修改對應「05 作用域函式與感測器監聽」。

圖片使用專案內的 Android Vector Drawable，無須額外下載。

## 開啟與建置

以 Android Studio 開啟此資料夾，完成 Gradle Sync 後執行 app。

Windows 命令列建置：`gradlew.bat :app:assembleDebug`。
