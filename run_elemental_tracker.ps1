# Enable error reporting
$ErrorActionPreference = "Stop"

# Change to the correct project directory
$PROJECT_PATH = "$env:USERPROFILE\Documents\Elemental_Tracker\src\main\java"
if (-Not (Test-Path $PROJECT_PATH)) {
    Write-Output "ERROR: Directory does not exist: $PROJECT_PATH"
    pause
    exit 1
}
Set-Location -Path $PROJECT_PATH

# Confirm execution environment
Write-Output "Running Elemental Tracker..."

# Run Java program and capture errors
try {
    java -cp "." org.example.Main
    Write-Output "Program finished successfully."
} catch {
    Write-Output "ERROR: Java execution failed!"
    Write-Output $_  # Print detailed error message
}

# Keep window open
Write-Output "Press any key to exit..."
$null = $Host.UI.RawUI.ReadKey('NoEcho,IncludeKeyDown')
