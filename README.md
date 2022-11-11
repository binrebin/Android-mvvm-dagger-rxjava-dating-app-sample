# roove  [![GitHub license](https://img.shields.io/github/license/muramrr/roove)](https://github.com/muramrr/roove/blob/master/LICENSE) [![](https://img.shields.io/badge/SDK-v21+-BLUE.svg)](https://shields.io/)

A simple dating app based on tinder-style cards. WIP 70% done.


Used libraries/patterns:
* MVVM pattern;
* Dagger 2;
* RxJava 2;
* Glide;
* Firebase Auth;
* Firestore to store *user, messages* data;
* Firestorage to store *photos*;
* Facebook SDK to login.



### Explanations

**So many developers, so many minds.**

Also, keep in mind, that *business* module should not contain android-based plugins. It is a pure kotlin module.

*Data* module is an android library.

*ViewModel* shoudn't contain any android imports, except androidx.lifecycle. 

*Log* classes in ViewModels for debug purposes only. They will be deleted after release.

MVVM pattern implementation in this project:



```
Copyright (c) 2019 Bijukumar Narayanan
```
