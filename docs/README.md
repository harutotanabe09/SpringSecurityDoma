# 技術のTips

## application.yaml

・メリット：日本語書いてもEclipseエラーにならない

## DBマイグレーション

・flywayツールでDBのバージョン管理を実現

・resource配下のdb/migrationのSQLを自動実行

・flyway_schema_historyテーブルが自動作成され、そこに履歴が残る

・application.yamlに記載が必要。設定しないとInitializedのエラーがでる。

## オブジェクトマッパー

・画面から受け取ったFormクラスとEntityクラスの橋渡し。

・ModelMapperを使用している。＠Beanクラスでないので、まずBeanにしてから。

・コントローラで使うため定義

## ２重送信防止

・formからJqueryでイベント呼び出して２重送信防止している

## 	PRG(Post-Redirect-Get)

・POSTしたらGETにリダイレクトする

## 	定数の使い方

以下のようにinterfaceから持ってくる

・import static app.web.base.WebConst.*;
 　※　米印がはずれない

## Spring Security

・以下設定まわり

・ログイン画面
　LoginHtmlController

・ログイン設定
　SecurityConfig

・ログインユーザをテーブルから取得する
　UserDetailsService

・平文解釈
　PasswordNoEnconder
　→　上記のログイン情報を挿入

・認証情報
　→　WebSecurityUtilsから取得
　→　ログイン中のUserNameを取得できる

## できていないこと

・CRUD画面の作成　CodeCategory　サンプル
https://github.com/miyabayt/spring-boot-doma2-sample/

・Dockerでの動作確認

・Actuorの導入と監視

・画面のAPI化

・identityエラーが発生する

・setAttributeのエラーメッセージ
