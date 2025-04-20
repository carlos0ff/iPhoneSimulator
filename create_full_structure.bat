@echo off
setlocal EnableDelayedExpansion

:: Caminho base
set ROOT=iPhoneSimulator

:: Criação de pastas
mkdir %ROOT%\src\com\iphonesimulator\core
mkdir %ROOT%\src\com\iphonesimulator\apps\Music
mkdir %ROOT%\src\com\iphonesimulator\services\notifications

:: Arquivo de teste 1
(
echo package com.iphonesimulator.core;
echo public class Device {
echo     public void start() {
echo         System.out.println("Device is starting...");
echo     }
echo }
) > %ROOT%\src\com\iphonesimulator\core\Device.java

:: Arquivo de teste 2
(
echo package com.iphonesimulator.apps.Music;
echo public class MusicApp {
echo     public void play() {
echo         System.out.println("Playing music...");
echo     }
echo }
) > %ROOT%\src\com\iphonesimulator\apps\Music\MusicApp.java

:: Arquivo de teste 3
(
echo package com.iphonesimulator.services.notifications;
echo public class NotificationService {
echo     public void notify(String message) {
echo         System.out.println("🔔 " + message);
echo     }
echo }
) > %ROOT%\src\com\iphonesimulator\services\notifications\NotificationService.java

echo.
echo ✅ Pastas e arquivos foram criados com sucesso!
pause
