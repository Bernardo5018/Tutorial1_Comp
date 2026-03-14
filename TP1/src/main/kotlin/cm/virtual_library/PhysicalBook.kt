package cm.virtual_library

class PhysicalBook(title: String, author: String, publicationYear: Int, val weight: Double, val hasHardcover: Boolean = true) : Book(title, author, publicationYear) {

    override fun getStorageInfo(): String {
        return "Physical Storage: ${"%.1f".format(weight)}g, Hardcover: $hasHardcover"
    }

    override fun showDetails() {
        super.showDetails()
        println("Storage Info: ${getStorageInfo()}")
    }
}