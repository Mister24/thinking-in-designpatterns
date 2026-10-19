# thinking-in-designpatterns

![Java](https://img.shields.io/badge/Java-8-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.1.6-blue.svg)

> Spring Boot 脚手架下的 GoF 设计模式学习工程（工厂、抽象工厂、策略、单例等）。

## 项目简介
在 Spring Boot 工程中落地常见创建型 / 行为型设计模式，既包含自实现的示例，也包含 runoob 教程示例，便于对照学习设计模式的经典写法。

## 技术栈
- Java 8
- Spring Boot 2.1.6
- Lombok、Guava、commons-lang3
- 构建：Maven（含 Maven Wrapper，`mvnw`）

## 目录结构（主要模式）
```
src/main/java/com/fayuan/
├── factoryPattern/              # 工厂模式
│   ├── easyFactory/             #   简单工厂
│   └── factory/                 #   工厂方法
├── runoob/                      # runoob 教程示例
│   ├── abstractFactoryPattern/  #   抽象工厂（颜色 / 形状）
│   └── factoryPattern/
├── strategyPattern/             # 策略模式（含 handlers / enums）
└── thinkingindesignpatterns/
    └── singletonPattern/        # 单例模式
```

## 运行方式
```bash
./mvnw spring-boot:run     # 或 mvn spring-boot:run
```
各模式在对应 package 下均有 `Main` 或测试类可运行。

## 说明
- 个人学习项目，部分依赖版本较旧（Spring Boot 2.1.x 已不在官方支持周期）。
- 仓库未声明开源协议（LICENSE）。
