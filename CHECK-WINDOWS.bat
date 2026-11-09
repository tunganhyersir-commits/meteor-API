@echo off
setlocal
cd /d "%~dp0"
call gradlew.bat :foundation:check :api:platformTest
if errorlevel 1 exit /b 1
py -3 tools\verify_release.py
exit /b %errorlevel%
