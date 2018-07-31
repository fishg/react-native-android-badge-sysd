# React Native Android Badge

[![NPM version](http://img.shields.io/npm/v/react-native-android-badge.svg?style=flat)](https://www.npmjs.com/package/react-native-android-badge-sysd)

A react native wrapper for [leolin310148/ShortcutBadger](https://github.com/leolin310148/ShortcutBadger).

## Why?

A react-native `PushNotificationIOS` provide setting badge of functions, it belongs to the native iOS support, but Android requires third-party library to do.

## Setup

```bash
$ npm i --save react-native-android-badge-sysd
$ react-native link
```

## Usage

```js
import BadgeAndroid from 'react-native-android-badge-sysd'
BadgeAndroid.setBadge(10);
```
