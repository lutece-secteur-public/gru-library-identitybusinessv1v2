/*
 * Copyright (c) 2002-2024, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.identitystore.v2.service.encryption;

import fr.paris.lutece.plugins.identitystore.v2.business.IClientApplication;
import fr.paris.lutece.plugins.identitystore.v2.web.rs.dto.IdentityDto;

/**
 * This interface permits to encrypt / decrypt an {@code IdentityDto}
 *
 */
public interface IIdentityEncryptionService
{
    /**
     * <p>
     * Encrypts an {@link IdentityDto} from the specified {@code IdentityDto}.
     * </p>
     * <p>
     * The provided {@code IdentityDto} is not modified.
     * </p>
     * 
     * @param identityDto
     *            the identity from which the {@code IdentityDto} is encrypted. Must not be {@code null}
     * @param clientApplication
     *            the client application for which the {@code IdentityDto} is encrypted. Must not be {@code null}
     * @return the encrypted {@code IdentityDto}
     */
    IdentityDto encrypt( IdentityDto identityDto, IClientApplication clientApplication );

    /**
     * <p>
     * Decrypts an {@link IdentityDto} from the specified {@code IdentityDto}.
     * </p>
     * <p>
     * The provided {@code IdentityDto} is not modified.
     * </p>
     * 
     * @param identityDto
     *            the identity from which the {@code IdentityDto} is decrypted. Must not be {@code null}
     * @param clientApplication
     *            the client application for which the {@code IdentityDto} is decrypted. Must not be {@code null}
     * @return the decrypted {@code IdentityDto}
     */
    IdentityDto decrypt( IdentityDto identityDto, IClientApplication clientApplication );
}
