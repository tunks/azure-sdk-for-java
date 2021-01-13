// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.chat.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The ChatMessageReadReceipt model. */
@Fluent
public final class ChatMessageReadReceipt {
    /*
     * Id of the participant who read the message.
     */
    @JsonProperty(value = "senderId", required = true)
    private String senderId;

    /*
     * Id of the chat message that has been read. This id is generated by the
     * server.
     */
    @JsonProperty(value = "chatMessageId", required = true)
    private String chatMessageId;

    /*
     * The time at which the message was read. The timestamp is in RFC3339
     * format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "readOn", required = true)
    private OffsetDateTime readOn;

    /**
     * Get the senderId property: Id of the participant who read the message.
     *
     * @return the senderId value.
     */
    public String getSenderId() {
        return this.senderId;
    }

    /**
     * Set the senderId property: Id of the participant who read the message.
     *
     * @param senderId the senderId value to set.
     * @return the ChatMessageReadReceipt object itself.
     */
    public ChatMessageReadReceipt setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }

    /**
     * Get the chatMessageId property: Id of the chat message that has been read. This id is generated by the server.
     *
     * @return the chatMessageId value.
     */
    public String getChatMessageId() {
        return this.chatMessageId;
    }

    /**
     * Set the chatMessageId property: Id of the chat message that has been read. This id is generated by the server.
     *
     * @param chatMessageId the chatMessageId value to set.
     * @return the ChatMessageReadReceipt object itself.
     */
    public ChatMessageReadReceipt setChatMessageId(String chatMessageId) {
        this.chatMessageId = chatMessageId;
        return this;
    }

    /**
     * Get the readOn property: The time at which the message was read. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the readOn value.
     */
    public OffsetDateTime getReadOn() {
        return this.readOn;
    }

    /**
     * Set the readOn property: The time at which the message was read. The timestamp is in RFC3339 format:
     * `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param readOn the readOn value to set.
     * @return the ChatMessageReadReceipt object itself.
     */
    public ChatMessageReadReceipt setReadOn(OffsetDateTime readOn) {
        this.readOn = readOn;
        return this;
    }
}
