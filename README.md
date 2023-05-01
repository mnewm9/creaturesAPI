# Sample Bugfixes for app

The app had problems launching bc the Koin DI Module had not been started and in the module a viewmodel was missing added VM

The list was not populating bc the api call to get the list was not yet implemented, thus implemented

The details were not showing on previous version because the viewmodel for that fragment had not declared values added

Created functionality to make the search bar more user friendly
