def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def clone(String branchName, String credentialsId, String address) {
    git branch: "${branchName}", credentialsId: "${credentialsId}", url: "${address}"
}