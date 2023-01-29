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
)