package net.emteeware.emteestockkeeper

import jakarta.persistence.*
import java.time.Instant
import java.util.UUID

@Entity
class Item (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    val id: Int,
    val typeId: UUID,
    val bestBeforeYear: Int?,
    val bestBeforeMonth: Int?,
    val bestBeforeDay: Int?,
    val addedOn: Instant = Instant.now(),
    @Transient
    var bestBefore: String?
) {
        fun toDto() : Item {
            bestBefore = if (bestBeforeYear != null) "$bestBeforeYear" else "∞"
            if (bestBeforeMonth != null) bestBefore += "-$bestBeforeMonth"
            if (bestBeforeDay != null) bestBefore += "-$bestBeforeDay"
            return this
        }
}