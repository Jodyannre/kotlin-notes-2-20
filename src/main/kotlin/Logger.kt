import java.util.logging.FileHandler
import java.util.logging.Handler
import java.util.logging.Logger
import java.util.logging.XMLFormatter
import java.util.logging.Filter
import java.util.logging.Level
import java.util.logging.LogRecord


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val logger = Logger.getLogger(Main::class.java.name)
        val fileHandler: Handler = FileHandler("default.log")
        logger.addHandler(fileHandler)
        fileHandler.formatter = XMLFormatter()
        logger.info("Info log message")
    }
}


class FilterExample : Filter {
    override fun isLoggable(record: LogRecord): Boolean {
        return if (record.level !== Level.INFO) {
            false
        } else true
    }
}


object Main2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val logger = Logger.getLogger(Main::class.java.name)
        val filter: Filter = FilterExample()
        logger.filter = filter
        logger.severe("Severe Log")
        logger.info("Info Log")
        logger.warning("Warning Log")
    }
}