@echo off
setlocal

:: Define the base project path
set "PROJECT_PATH=%USERPROFILE%\Documents\Elemental_Tracker\src\main\java"

:: Change directory to project folder
cd /d "%PROJECT_PATH%"

:: Compile all Java files inside 'org/example' (handling package structure)
echo Compiling Java files...
javac -d "%PROJECT_PATH%" org/example/*.java

:: Check for compilation errors
if %errorlevel% neq 0 (
    echo Compilation failed! Check the errors above.
    pause
    exit /b 1
)

echo Compilation complete!
pause
