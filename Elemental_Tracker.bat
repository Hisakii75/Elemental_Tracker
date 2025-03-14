@echo off
setlocal

:: Define the script path
set "SCRIPT_PATH=%USERPROFILE%\Documents\Elemental_Tracker\run_elemental_tracker.ps1"

:: Ensure Windows Terminal is available
where wt >nul 2>nul
if %errorlevel% neq 0 (
    echo ERROR: Windows Terminal (wt) not found. Running in regular PowerShell...
    powershell -NoExit -File "%SCRIPT_PATH%"
    exit /b
)

:: Start Windows Terminal and execute the script
echo Starting Windows Terminal...
wt -w 0 new-tab powershell -NoExit -ExecutionPolicy Bypass -File "%SCRIPT_PATH%"
