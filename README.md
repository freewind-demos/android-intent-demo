# Android Intent 意图演示

## 简介

本 Demo 演示 Android Intent 的显式和隐式跳转。

## 基本原理

### Intent 类型

1. **显式 Intent**: 指定目标组件
2. **隐式 Intent**: 通过 action/data 匹配

## 教程

### 显式跳转
```kotlin
val intent = Intent(this, SecondActivity::class.java)
intent.putExtra("key", "value")
startActivity(intent)
```

### 隐式跳转
```kotlin
val intent = Intent(Intent.ACTION_VIEW)
intent.data = Uri.parse("https://...")
startActivity(intent)
```

### 接收数据
```kotlin
val name = intent.getStringExtra("name")
```
