@echo off
setlocal
cd /d "%~dp0"
call gradlew.bat :foundation:check :adapter:build :example-addon:build
if errorlevel 1 exit /b 1
py -3 tools\package_runtime.py --adapter adapter\build\libs\meteor-lib-api-0.1.0.jar
if errorlevel 1 exit /b 1
if not exist dist\optional mkdir dist\optional
copy /Y example-addon\build\libs\meteor-lib-example-0.1.0.jar dist\optional\ >nul
echo Build hoan tat. Xem dist.
