/***********************************************************************************************************************
 *
 * Copyright (C) 2010 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/

package eu.stratosphere.pact.common.io.pax.io.compression;

/**
 * Common interface for compression algorithms used
 * to decompress the columns of the row groups.
 *
 */
public interface IDecompressor {

    /**
     * Decompress the data into the given buffer.
     *
     * @param data               the data to be decompressed.
     * @param uncompressedBuffer the buffer where the uncompressed data should be stored.
     */
    void decompress(byte[] data, byte[] uncompressedBuffer) throws DecompressorException;

    /**
     * Exceptions thrown by {@link IDecompressor} instances.
     */
    static class DecompressorException extends RuntimeException {

        public DecompressorException(String message) {
            super(message);
        }

        public DecompressorException(String message, Throwable cause) {
            super(message, cause);
        }

        public DecompressorException(Throwable cause) {
            super(cause);
        }
    }
}
