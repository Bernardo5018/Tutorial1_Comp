package cm.virtual_library

class DigitalBook(title: String, author: String, publicationYear: Int, val fileSize: Double, val format: String) : Book(title, author, publicationYear) {

    override fun getStorageInfo(): String {
        return "Digital Storage: ${"%.1f".format(fileSize)} MB, Format: $format"
    }

    override fun showDetails() {
        super.showDetails()
        println("Storage Info: ${getStorageInfo()}")
    }
}