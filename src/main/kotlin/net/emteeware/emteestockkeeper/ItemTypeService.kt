package net.emteeware.emteestockkeeper

import org.springframework.stereotype.Service
import java.util.*

@Service
class ItemTypeService(val db: ItemTypeRepository) {
    fun findItemTypes(): List<ItemType> = db.findAll().toList()

    fun findItemTypeById(id: UUID) : List<ItemType> = db.findById(id).toList()

    fun findItemTypeByGtin(gtin: String) : List<ItemType> = db.findByGtin(gtin).toList()

    fun save(itemType: ItemType) {
        db.save(itemType)
    }

    fun <T : Any> Optional<out T>.toList(): List<T> =
        if (isPresent) listOf(get()) else emptyList()
}
