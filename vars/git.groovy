def clone(String branchName, String credentialsId, String address) {
    git branch: "${branchName}", credentialsId: "${credentialsId}", url: "${address}"
}


