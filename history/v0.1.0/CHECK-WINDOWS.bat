@echo off
setlocal
cd /d "%~dp0"
call gradlew.bat :foundation:check
if errorlevel 1 exit /b 1
py -3 tools\package_runtime.py --verify dist\meteor-lib-runtime-0.1.0-mc1.21.11.jar
exit /b %errorlevel%
